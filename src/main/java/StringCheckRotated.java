import java.util.HashMap;

public class StringCheckRotated {

    public HashMap<Character, Integer> countUnique(String origin) {
        HashMap<Character, Integer> data = new HashMap<>();
        for (int i = 0; i < origin.length(); i++) {
            char ch = origin.charAt(i);
            data.merge(ch, 1, (cnt, delta) -> cnt + delta);

        }
        return data;
    }
    public boolean permutation(String origin, String rotated) {

        return countUnique(origin).equals(countUnique(rotated)) ? true : false;
//         if(countUnique(origin).equals(countUnique(rotated))){
//            return true;
//        }
//        else{
//            return false;
//        }

        //  throw new IllegalArgumentException("should be implemented");
    }


    public boolean check(String origin, String rotated){
        return ((origin+origin).contains(rotated))&&(origin.length()==rotated.length())?true:false;
        // if string is rotated then two copies of original will contain the rotated one as substring
    }





}