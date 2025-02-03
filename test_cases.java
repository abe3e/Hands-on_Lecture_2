public class test_cases {
    public static void main(String[] args) {

        System.out.println("Pascal Triangle Test Cases: 5 Rows and 3 Rows");
        System.out.println(pascal_triangle.generate(5));
        System.out.println(pascal_triangle.generate(3));


        System.out.println("Spiral Matrix Test Cases: {{1,2,3},{4,5,6},{7,8,9}} and {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}");
        int[][] test = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] test2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(spiral_matrix.spiralOrder(test));
        System.out.println(spiral_matrix.spiralOrder(test2));

    }
}
