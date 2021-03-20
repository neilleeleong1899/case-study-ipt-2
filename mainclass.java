import java.util.*;
public class mainclass {
    public static int cart=0;
    public static int count=0;
    //resets the username password
    public static String asd;
    //for username and password
    public static String username;
    public static String password;
    //wraps
    public static int[]WpriceJ={90,110};
    //biryani
    public static int[]BRBprice={130,110};
    //names of employee
    public static String[]empname={"Jose Santos","Princess Alyssa Cabenta","Erica Yoro","Joshua Lopez","Neil Lee Leong"};
    //employee ids
    public static int[]empno={2018300994,2018301235,2018300405,2018300664,2018300564};
    //names of menu
    public static String[]BRB={"Beef Kebab Biryani(130Php)","Signature Chicken Biryani(110Php)"};
    public static String[]Wraps={"Chicken Shawrma(90Php)","Beef Kebab(110Php)"};
    //size of inputed order
    public static String[]data=new String[99];
    //scanner and random
    public static Scanner sc = new Scanner(System.in);
    public static Random rand=new Random();
    //for price
    public static int price=0;
    //random for employee
    public static int random=rand.nextInt(4);//3
    //for the choices
    public static String ans;
    //customer name
    public static String cusname;
    //customer contact
    public static String contact;
    //customer address
    public static String address;
    //output of employee name will be randomized by random
    public static employee emp=new employee(empname[random]);
                                                    //3
    /*for login account 
    username: user
    password: 1234*/
    public static login log= new login();
 
   
    public static void main(String args[]){
       
        //input for account
        log.getUsername("user");
        log.getPassword("1234");
            System.out.println("Welcome to Arraboo");
            System.out.println("Please Login");
            intro();
    }
    //input for login
    public static void intro(){ 
            System.out.print("Username: ");
        username=sc.nextLine();
            System.out.print("Password: ");
        password=sc.nextLine();
            account();
    }
    //login using the account
    public static void account(){
        if(username.equals("user")&&password.equals("1234")){
            menu();
        }else{
            System.out.println("Invalid account please try again.");  
            intro();  
        }
    }
    //menu method
    public static void menu(){
        System.out.println("Cart: "+cart);
        System.out.println("Please Select Menu");
        if(price==0){
            System.out.println("Invalid Input");
        }else{
            System.out.print("0. Checkout   ");
        }
        int j=0;
            for(int i=1; i <=4;i++){
                if(i<=2){
                System.out.print(i+". "+BRB[i-1]+"   ");
            }else{
                
                System.out.print(i+". "+Wraps[j]+"   ");
                j++;
            }
            
        }
        System.out.print("  5.logout");
        System.out.println();
        System.out.print("Please Choose: ");
        ans=sc.next();
        if(ans.equals("1")){
            biryani();
        }else if(ans.equals("2")){
            biryani();
        }else if(ans.equals("3")){
            shawarma();
        }else if(ans.equals("4")){
            shawarma();
        }else if(ans.equals("5")){
            System.out.println("Thankyou Come Again!");
            System.exit(0);
            
        }else if(ans.equals("0")){
            if(price==0){
                System.out.println("Invalid input please try again");
                menu();
            }else{
                checkout();
            }
        }
        else{
            System.out.println("Invalid input please try again");
            menu();
        }
    }public static void biryani(){
        if(ans.equals("1")){
            System.out.println("add "+BRB[0]+" to your order?");
                System.out.println("1. Add to cart    2.back");
                System.out.print("Please Choose: ");
                ans=sc.next();
                if(ans.equals("1")){
                    price=price+BRBprice[0];
                    data[count]=BRB[0];
                    count++;
                    cart++;
                    menu();
                }else if(ans.equals("2")){
                    menu();
                }else{
                    System.out.println("Invalid input, please try again");
                    menu();
                }
        }else if(ans.equals("2")){
        System.out.println("add "+BRB[1]+" to your order?");
                System.out.println("1. Add to cart    2.back");
                System.out.print("Please Choose: ");
                ans=sc.next();
        if(ans.equals("1")){
            price=price+BRBprice[1];
            data[count]=BRB[1];
            count++;
            cart++;
            menu();
        }else if(ans.equals("2")){
            menu();
        }else{
            System.out.println("Invalid input, please try again");
            menu();
        }
        }
    }
    public static void shawarma(){

        if(ans.equals("3")){
            System.out.println("add "+Wraps[0]+" to your order?");
                System.out.println("1. Add to cart    2.back");
                System.out.print("Please Choose: ");
                ans=sc.next();
                if(ans.equals("1")){
                    price=price+WpriceJ[0];
                    data[count]=Wraps[0];
                    count++;
                    cart++;
                    menu();
                }else if(ans.equals("2")){
                    menu();
                }else{
                    System.out.println("Invalid input, please try again");
                    menu();
                }
    
        }else if(ans.equals("4")){
        System.out.println("add "+Wraps[1]+" to your order?");
                System.out.println("1. Add to cart    2.back");
                System.out.print("Please Choose: ");
                ans=sc.next();
        if(ans.equals("1")){
            price=price+WpriceJ[1];
            data[count]=Wraps[1];
            count++;
            cart++;
            menu();
        }else if(ans.equals("2")){
            menu();
        }
        else{
            System.out.println("Invalid input, please try again");
            menu();
        }
        }
    
    }
    public static void checkout(){
        System.out.println();
        System.out.println("Your Orders are: ");
        for(int j=1;j<=count;j++){
            System.out.println(data[j-1]);
        }
        System.out.println(price+"Php");
        System.out.println("1. Remove Order     2. Proceed to Payment     3. Back");
        System.out.print("Please Choose: ");
        ans=sc.next();
        
        if(ans.equals("1")){
            if(price==0){
               
               System.out.println("You have 0 in your cart.");
               menu();
            } else{
                remove();
            }
        }else if(ans.equals("2")){
            paymentmethod();
        }else if(ans.equals("3")){
            menu();
        }
        
    }
    public static void remove(){
        System.out.println("____________________________________");
        System.out.println("What order you want to remove?");
        
        for(int i=1;i<=count;i++){
            System.out.println(i+". "+data[i-1]);
          }
        System.out.println("0. Back");
        System.out.println();
        System.out.print("Please Enter Number:");
        int rindex=sc.nextInt();
        System.out.println();
        if(rindex==0){
            System.out.println("You have 0 orders");
            System.out.println();
        }else if(rindex<=count){ 
            if(data[rindex-1].equals(Wraps[1])||data[rindex-1].equals(BRB[1])){
                price=price-110 ;
            }else if(data[rindex-1].equals(Wraps[0])){
                price=price-90;
            }else if(data[rindex-1].equals(BRB[0])){
                price=price-130;
            }
        for(int i = rindex-1; i < count-1; i++){
            data[i] = data[i +1];
          }
          cart--;
          count--;
          System.out.println("Remove Successful");
         menu();
        }else{
            System.out.println("Invalid input, please try again");
            System.out.println();
            remove();
        }
        }
        public static void paymentmethod(){
            Scanner sc1=new Scanner(System.in);
            Scanner sc2=new Scanner(System.in);
            System.out.println("Select your payment method");
            System.out.println("1. Cash on Delivery      2. Back");
            System.out.print("Please Choose: ");
            ans=sc.next();
            if(ans.equals("1")){
                System.out.println();
                System.out.println("Checkout");
                System.out.println();
                System.out.print("Enter your name: ");
                cusname=sc1.nextLine();
                System.out.print("Enter your contact number/email: ");
                contact=sc2.nextLine();
               
                System.out.print("Enter you address: ");
                address=sc1.nextLine();
                printer();
            }else if(ans.equals("2")){
                menu();
            }else{
                System.out.println("Invalid input, please try again");
                paymentmethod();
            }
          
        }
       
       
        public static void printer(){
            customer cos=new customer(cusname);
            receipt p=new receipt();
            cos.getAdd(address);
            cos.getCon(contact);
            emp.getEmployeeeID(empno[random]);
            System.out.println("********************************");
            System.out.println("   Arraboo.ph  ");
            System.out.println(" Your orders are  ");
            for(int i=1;i<=count;i++){
                System.out.println(i+". "+data[i-1]);
              }
              System.out.println("Subtotal: "+price+"Php");
              System.out.println("Delivery fee: 40Php");
              price=price+40;
              System.out.println("Total: (incl. VAT): "+price+"Php");
            p.prints(emp);
            p.prints2(cos);
            System.out.println("********************************");
        }


    
}
