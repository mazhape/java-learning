import requests
from flask import Flask, request, jsonify
from slack_sdk import WebClient
from slack_sdk.errors import SlackApiError

app = Flask(__name__)

# Initialize Slack client
slack_token = "YOUR_SLACK_BOT_TOKEN"
slack_channel = "SLACK_CHANNEL_ID"
slack_client = WebClient(token=slack_token)

# Database setup (Pseudo code, replace with actual DB implementation)
# db = YourDatabaseConnection()

# Endpoint to receive transaction notifications from the banking API
@app.route('/transaction', methods=['POST'])
def transaction_received():
    transaction_details = request.json
    amount = transaction_details['amount']
    merchant = transaction_details['merchant']
    # Send a message to Slack with transaction details and approval actions
    try:
        slack_client.chat_postMessage(
            channel=slack_channel,
            text=f"New transaction alert: {amount} spent at {merchant}. Approve?",
            attachments=[
                {
                    "text": "Choose an action",
                    "fallback": "You are unable to choose an action",
                    "callback_id": "transaction_approval",
                    "color": "#3AA3E3",
                    "attachment_type": "default",
                    "actions": [
                        {
                            "name": "approve",
                            "text": "Approve",
                            "type": "button",
                            "value": "approve"
                        },
                        {
                            "name": "deny",
                            "text": "Deny",
                            "type": "button",
                            "value": "deny"
                        }
                    ]
                }
            ]
        )
    except SlackApiError as e:
        print(f"Error posting to Slack: {e}")

    return jsonify({"status": "success"}), 200

# Placeholder for Slack command handling (e.g., for approvals)
# This would involve setting up a Slack app with command handling capabilities
# and updating the database based on the command received.

if __name__ == '__main__':
    app.run(debug=True)