package lesson9.enum_constants.ext;

import lesson9.enum_constants.DimensionConstants;

class Main {
    public static void main(String[] args) {
        DimensionConstants dimension = DimensionConstants.LENGTH;
        System.out.println(dimension.getDimension());//1.0
        dimension = DimensionConstants.WIDTH;
        System.out.println(dimension.getDimension());//2.0

    }
}
