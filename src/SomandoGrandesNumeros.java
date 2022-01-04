import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

public class SomandoGrandesNumeros {
    public static void main(String[] args) {
        List<Long> grandes = new ArrayList<>();

        grandes.add(1000000001L);
        grandes.add(1000000002L);
        grandes.add(1000000003L);
        grandes.add(1000000004L);
        grandes.add(1000000005L);

        Long resultado = 0L;

        resultado = grandes.stream().flatMapToLong(LongStream::of).sum();

        System.out.println(resultado);
    }
}
