public class Pet {

    private String name;
    private String petType;



    public Pet(String name, String petType){
        this.name = name;
        this.petType = petType;




    }

    public String speak(){

        return "Some random sound";
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }




}
