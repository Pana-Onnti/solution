public class array_of_integers {
    public int moveNonZerosToLeft(int[] nums) {
        int n = nums.length;
        int nonZeroIndex = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        for (int i = nonZeroIndex; i < n; i++) {
            nums[i] = 0;
        }

        return nonZeroIndex;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 0, 0, 3, 4};
        array_of_integers mover = new array_of_integers();
        int nonZeroCount = mover.moveNonZerosToLeft(nums);

        System.out.println("Número de elementos no nulos: " + nonZeroCount);
        System.out.print("Array después de mover los elementos no nulos: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
// Supone una complejidad lineal, ya que recorre el arreglo dos veces, una para mover los elementos no nulos y otra para rellenar con ceros.
// pero no comprendo a fondo el asunto de complejidad, solamente que es lineal en el sentido de aumentar el tiempo de ejecución en proporción al tamaño del arreglo.