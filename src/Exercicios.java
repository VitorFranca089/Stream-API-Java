import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Exercicios {

    private final List<Integer> nums;

    public Exercicios(List<Integer> numeros){
        this.nums = new ArrayList<>(numeros);
    }

    public List<Integer> ex1(){
        return nums.stream().sorted().toList();
    }

    public int ex2(){
        return nums.stream().filter(n -> n % 2 == 0).reduce(0, (Integer::sum));
    }

    public boolean ex3(){
        return nums.stream().allMatch(n -> n > 0);
    }

    public List<Integer> ex4(){
        return nums.stream().filter(n -> n % 2 == 0).toList();
    }

    public double ex5(){
        List<Integer> maior = nums.stream().filter(n -> n > 5).toList();
        return (double) maior.stream().reduce(0, (Integer::sum)) / maior.size();
    }

    public boolean ex6(){
        return nums.stream().anyMatch(n -> n > 10);
    }

    public int ex7(){
        return nums.stream().sorted().toList().reversed().get(1);
    }


    public int ex8(){
        return nums.stream().reduce(0, (Integer::sum));
    }

    public boolean ex9(){
        return nums.stream().distinct().count() == nums.size();
    }

    public List<Integer> ex10(){
        return nums.stream().filter(n -> n % 2 != 0 && ( n % 3 == 0 || n % 5 == 0)).toList();
    }

    public List<Integer> ex11(){
        return nums.stream().map(n -> n * n).toList();
    }

    public int ex12(){
        return nums.stream().reduce(1, ((n1, n2) -> n1 * n2));
    }

    public List<Integer> ex13(int menor, int maior){
        return nums.stream().filter(n -> n >= menor && n <= maior).toList();
    }

    public int ex14(){
        return nums.stream().filter(Exercicios::isPrimo).max(Integer::compareTo).orElse(0);
    }

    public List<Integer> ex15(){
        return nums.stream().filter(n -> n < 0).toList();
    }

    public List<List<Integer>> ex16(){
        List<List<Integer>> resultado = new ArrayList<>();
        resultado.add(nums.stream().filter(n -> n % 2 == 0).toList());
        resultado.add(nums.stream().filter(n -> n % 2 != 0).toList());
        return resultado;
    }

    public List<Integer> ex17(){
        return nums.stream().filter(Exercicios::isPrimo).toList();
    }

    public boolean ex18(){
        int primeiroNumero = nums.getFirst();
        return nums.stream().allMatch(n -> n.equals(primeiroNumero));
    }

    public int ex19(){
        return nums.stream().filter(n -> n % 3 == 0 && n % 5 == 0).reduce(0, (Integer::sum));
    }

    private static boolean isPrimo(int num){
        if(num <= 1){
            return false;
        }
        return IntStream.rangeClosed(2, (int) Math.sqrt(num)).noneMatch(n -> num % n == 0);
    }

}
