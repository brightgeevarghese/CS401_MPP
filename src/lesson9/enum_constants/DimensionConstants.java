package lesson9.enum_constants;

public enum DimensionConstants {
    //value of LENGTH should be 1.0
    //value of WIDTH should be 2.0
    LENGTH(1.0), WIDTH(2.0);

    private double dimension;
    //The following constructor is taken as private only
    DimensionConstants(double dimension) {
        this.dimension = dimension;
    }

    public double getDimension() {
        return dimension;
    }
}


