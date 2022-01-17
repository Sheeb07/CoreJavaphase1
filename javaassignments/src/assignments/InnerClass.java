package assignments;

class Film {
    String filmName;
    String filmType;

    // assign values using constructor
    public Film(String name, String type) {
        this.filmName = name;
        this.filmType = type;
    }

    // private method
    private String getFilmName() {
        return this.filmName;
    }
    //method as inner class
    void method(){
    	// inner class
        class Hollywood {
            String hollywoodType;
            
            void setHollywood() {

               // Accessing the filmType property of Film
                if(Film.this.filmType.equals("Thegooddoctor")){

                    // Invoking method getCarName() of Film
                    if(Film.this.getFilmName().equals("Spider-Man")) {
                        this.hollywoodType = "romantic";
                    } else {
                        this.hollywoodType = "adventurous";
                    }

                }else{
                    this.hollywoodType = "Action";
                }
            }
            
            String getHollywoodType(){
                return this.hollywoodType;
            }
        }
        Hollywood hollywood1 = new Hollywood();
        hollywood1.setHollywood();
        System.out.println("Hollywood Type for Fast and furious= " +hollywood1.getHollywoodType());

        Hollywood hollywood2 = new Hollywood();
        hollywood2.setHollywood();
        System.out.println("Hollywood Type for Thegooddoctor= " + hollywood2.getHollywoodType());
        

    }
}

  public class InnerClass {
    public static void main(String[] args) {

// create an object of the outer class Film
    	Film film1=new Film("Fast & Furious","action");
    	film1.method();
    	Film film2=new Film("Thegooddoctor","Action");
    	film2.method();
    }
}



