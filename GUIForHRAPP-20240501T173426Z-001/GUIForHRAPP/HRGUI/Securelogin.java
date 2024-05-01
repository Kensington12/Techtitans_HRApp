public class Securelogin extends EmployeeInformation {


    private boolean validName(String nameToCheck) { 
        boolean passes = true;
         int i = 0;
        char c;
        while ( i < nameToCheck.length() && passes ) { 
            c = nameToCheck.charAt(i);
            if ( !((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') 
                    || c == '-' || c == ' ' || (int)c == 39) ) {
                passes = false;
            }
            i++;
        }
       
        return passes;
    }

    private boolean validPassword(String checkPassword) {
        boolean passes = true;
         int i = 0;
        char c;
        while(i < checkPassword.length() && passes){
            c = checkPassword.charAt(i);
            if(checkPassword.length() < 8){
            passes = false;
            }
            
            if(!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '!' )){
            }
            i++ ;
        }

       return passes;
    }

    private String convertUserToLower(String username) {
        String nStr = "";
        char c;
        for (int i = 0; i < username.length(); i++) {
            c = username.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char)((int) c + 32);
            }
            nStr += c;
        }
        return nStr;
    }

    private boolean validEmailAddress(String emailCheck) {
        boolean passes = true;
     int i = 0;
     char c;
     int numberOfAtSigns = 0;
     int numberOfCharactersAfterLastDot;
     boolean charactersAfterDotPasses = false;
     int dotLocation = 0;
     
     while (i < emailCheck.length() && passes) {
         c = emailCheck.charAt(i);
         if ( !((c >= 'a' && c <= 'z') || 
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9') ||
                 c == '@' ||
                 c == '.') ) {
             passes = false;
         }
         if ( c == '@' ) {
             numberOfAtSigns++;
             if (i == 0) {
                 passes = false;
             }
         } else if ( c == '.' ) {  
             dotLocation = i;
             if (i == 0) {
                 passes = false;
             }
         }
         i++;
     }

     numberOfCharactersAfterLastDot = (emailCheck.length() - 1) - dotLocation;
     
     if ( numberOfCharactersAfterLastDot == 3  || numberOfCharactersAfterLastDot == 2) {
         charactersAfterDotPasses = true;
     }
     
     if ( !(numberOfAtSigns == 1   &&   charactersAfterDotPasses) ) {
         passes = false;
     }
     
     return passes;    
 }

    
}
