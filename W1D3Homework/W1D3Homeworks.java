import java.util.*;


class W1D3Homeworks {
    private static FindDuplicate findDuplicate;
    private static Palindrome palindrome;
    private static FizzyCalc fizzyCalc;
    private static Anagrams anagrams;
    private static MultiTable multiTable;

    public static void main(String[] args) {

        findDuplicate =new FindDuplicate();
        palindrome =new Palindrome();
        fizzyCalc =new FizzyCalc();
        anagrams =new Anagrams();
        multiTable =new MultiTable();

        List<String> duplicateList = new ArrayList<String>();
        duplicateList.add("geek");
        duplicateList.add("geek");
        duplicateList.add("geek");
        duplicateList.add("leek");
        duplicateList.add("foo");
        duplicateList.add("var");
        duplicateList.add("var");
        duplicateList.add("doughnut");
        duplicateList.add("boogie");

        findDuplicate.findDuplicates(duplicateList);

        String notpalindrome = "nope";
        String ispalindrome = "racecar";

        System.out.println(palindrome.checkPalidrome(notpalindrome));
        System.out.println(palindrome.checkPalidrome(ispalindrome));

        fizzyCalc.fizzBuzzCalc(3);
        fizzyCalc.fizzBuzzCalc(5);
        fizzyCalc.fizzBuzzCalc(15);

        String anagram1="vile";
        String anagram2="evil";

        anagrams.checkAnagrams(anagram1,anagram2);
        multiTable.printTables();

    }

}


class FindDuplicate
{

    public void findDuplicates (List<String> strings){

        Map<String,Integer> dupMap = new HashMap<String, Integer>();
        for(String key: strings){
            if(dupMap.containsKey(key))
                dupMap.put(key,dupMap.get(key)+1);
            else
                dupMap.put(key,1);
        }
        for(Map.Entry<String, Integer> entry :dupMap.entrySet())
        {
            if (entry.getValue()>1)
                System.out.println("This has duplicates: "+entry.getKey());
        }

        System.out.println();

    }
}


class Palindrome{

    public boolean checkPalidrome(String word){

        String reverseWord="";

        for (int i =word.length()-1; i>=0; i--){
            reverseWord=reverseWord+word.charAt(i);

        }
        if (reverseWord.equals(word)){
            return true;
        }
        return false;
    }
}


class FizzyCalc{
    public void fizzBuzzCalc(int number){
        if (number%3==0 && number%5==0){
            System.out.println("fizzbuzz");
            System.out.println();

        }
        else if(number%3==0){
            System.out.println("fizz");
            System.out.println();

        }
        else if (number%5==0){
            System.out.println("buzz");
            System.out.println();

        }

        else
        {
            System.out.println("Not fizzy or buzzy.");
            System.out.println();

        }

    }
}


class Anagrams{
    public boolean checkAnagrams(String word1, String word2){
        String wordle1=word1.replaceAll(""," ");
        String wordle2=word2.replaceAll(""," ");


        char[] array1 = wordle1.toCharArray();
        char[] array2 = wordle2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        if(Arrays.equals(array1,array2))
            return true;
        return false;


    }
}

class MultiTable{
    public void printTables(){
        int [][] multiArray = new int[10][10];
        int count =1;
        for (int x=0;x<10;x++)
        {
            for (int y=0;y<10;y++)
            {
                multiArray[x][y] =count;
                count++;
            }
        }

        for (int x=0;x<10;x++)
        {
            for (int y=0;y<10;y++)
            {
                System.out.print(multiArray[x][y] + " ");
            }
            System.out.println();

        }
    }
}
