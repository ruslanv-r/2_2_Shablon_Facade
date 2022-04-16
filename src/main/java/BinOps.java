public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/


        int val = Integer.parseInt(a, 2);
        int val2 = Integer.parseInt(b, 2);

        return Integer.toBinaryString(val + val2);
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/

        return Integer.toBinaryString(Integer.parseInt(a, 2) * Integer.parseInt(b, 2));

    }
}