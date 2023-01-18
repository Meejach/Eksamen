public class Names {

    private String firstName;
    private  String middleName;
    private String lastName;


    public Names (String fullName){
        String[] splitNames = fullName.split(" ");

        if(splitNames.length == 3) {
            this.firstName = splitNames[0];
            this.middleName = splitNames[1];
            this.lastName = splitNames[2];
        }
        else {
            this.firstName = splitNames[0];
            this.lastName = splitNames[1];
        }
    }

    public void udskriv() {
        StringBuilder builder = new StringBuilder();
        builder.append(firstName + " ");
        if(middleName != null) {
            builder.append(middleName + " ");
        }
        builder.append(lastName);
        System.out.println(builder);
    }
}
