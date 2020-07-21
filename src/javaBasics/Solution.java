package javaBasics;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Test1 {

    static int length=0;
    static String value = "Yes";
    static int i=0;

    public static String partitionArray(int k, List<Integer> numbers) {
        length = numbers.size();

        System.out.println(k +"                        "+length);
        for(Integer l:numbers){
            System.out.print(l);
        }
        if(length%k==0){
                while(i<length){
                    for(int j=1;j<(length/k);j++){
                        if(numbers.get(i)==numbers.get(j)){
                           value = "No"; 
                            break;
                        }

                    }
                    if(value=="No")
                        break;
                    else
                        i=i+k;
                }
        }
        else
            value = "No";
        return value;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> numbers = IntStream.range(0, numbersCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        String result = Test1.partitionArray(k, numbers);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}



//855310435036867988157998910617636226939865244095461035781796284238395244601693515338846221153873590510786467139996323365242867911199701867985065502307557096064573864625927380715255527149837883645671048242115454025868679462645082491903926526747867976468679182039114692464345415918679896186797223863595486798679466650503225781786795479773728382778484030664225778864783937683594864938304196486153990
//10
//100
