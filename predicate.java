import java.awt.*;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        /*
        Predicate<Integer> isPositive = x -> x > 0;

        Predicate<String> isFullName = zita -> {
            String[] mipatso = zita.split(" ");
            return mipatso.length == 2;
        };

        Predicate<Integer> hasAGrade = mark -> mark >= 75;
        Predicate<Integer> hasBGrade = mark -> mark >= 65;
        Predicate<Integer> hasCGrade = mark -> mark >= 50;
        Predicate<Integer> isBelow50 = mark -> mark < 50;

        Predicate<Integer> hasPassed = isBelow50.negate();


        if ( isFullName.test("Sam Takunda") ) {
            System.out.println("✅ The student passed");
        } else {
            System.out.println("❌ They failed");
        }
        */

        // --------------------

        Predicate<Munhu> ndiMadzibaba = munhu -> munhu.gender == "M";
        Predicate<Munhu> ndewechidiki = munhu -> munhu.age < 20; /* NINEZ: checks if age is below 20 */ 
        Predicate<Munhu> ndewekuHarare = munhu -> munhu.city.equals("Harare"); /* Tweenie: checks if city is Harare */ ;
        Predicate<Munhu> haasiWekuHarare = ndewekuHarare.negate(); /* Bhururu: checks if not Harare (tip: use negate) */ ;
        
    
        // Predicate<Munhu> aneZita = munhu -> munhu.name == "";/* N'omso: checks if name is not empty string */ ;
        Predicate<Munhu> aneZita = munhu -> !munhu.name.isEmpty();
        Predicate<Munhu> isMadzibabaVaneZitaVechidikiVekuHarare = ndiMadzibaba.and(ndewechidiki).and(ndewekuHarare).and(aneZita);
        Predicate<Munhu> isMadzimaiVaneZitaVechikuruVekunzeKweHarare = ndiMadzibaba.negate().and(ndewechidiki).negate().and(haasiWekuHarare).and(aneZita);

        Munhu zaka = new Munhu("M", 17, "Harare", "Zaka");
        Munhu cr7 = new Munhu("F", 58, "Bulawayo", "CR7");

        if (ndewekuHarare.test(zaka)) {
            System.out.println("✅ Ndeve ku Harare");
        }else{
            System.out.println("❌ Havasi ve ku Harare");
        }
        
        

        if ( isMadzibabaVaneZitaVechidikiVekuHarare.test(zaka) ) {
            System.out.println("✅ ZAKA PASSED ");
        } else {
            System.out.println("❌ ZAKA FAILED");
        }
        
        if ( isMadzimaiVaneZitaVechikuruVekunzeKweHarare.test(cr7) ) {
            System.out.println("✅ CR7 PASSED ");
        } else {
            System.out.println("❌ CR7 FAILED");
        }
        
    }
}