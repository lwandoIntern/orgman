package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;

public class GenderFactory {

    private static final String SUFFIX = Helper.getSuffixFromClassName(GenderFactory.class); // Expecting GF from (G)ender(F)actory.

    //TODO: implement method body ONLY!
    public static Gender buildGender(String genderDescription) {
        String id = Helper.generateRandomGivenSuffic(SUFFIX);
        return new Gender.Builder()
                .genderId(id)
                .genderDescription(genderDescription)
                .build();
        /**
         * Your implementation goes here
         * INSTRUCTIONS
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not supported yet.");]
         * 3. Generate random id using SUFFIX (Hint: call generateRandomGivenSuffix method in Helper class)
         * 4. Build and return an object of Gender
         */

    }
}
