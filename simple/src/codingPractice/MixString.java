package codingPractice;

public class MixString {
    public void separateSrting(String mixName)
    {
        StringBuffer alphaCharacter = new StringBuffer();
        StringBuffer numberCharacter = new StringBuffer();
        StringBuffer specialCharacter = new StringBuffer();

        for (int index =0; index<mixName.length();index++)
        {
            if(Character.isDigit(mixName.charAt(index))){

                numberCharacter.append(mixName.charAt(index));
            } else if (Character.isAlphabetic(mixName.charAt(index))) {
                alphaCharacter.append(mixName.charAt(index));
            } else specialCharacter.append(mixName.charAt(index));
        }
        System.out.println("The Number in String is : "+ numberCharacter);
        System.out.println("The Alphabet  in String is : "+ alphaCharacter);
        System.out.println("The special symbol in String is : "+ specialCharacter);
    }
}
