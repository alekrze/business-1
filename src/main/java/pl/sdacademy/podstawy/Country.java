package pl.sdacademy.podstawy;

public class Country {
    private final int retirementAge;
    private final String countryName;

    public Country(int retirementAge, String countryName){
        this.retirementAge = retirementAge;
        this.countryName = countryName;
    }

    public int getRetirementAge() {
        return retirementAge;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public String toString() {
        return countryName;
    }
}
