class Central_Bank{

    double interate(){
        return 7.7;
    }
}


class UBL extends Central_Bank{
@Override

double interate(){

    return 10.7;

}
 
}

class HBL extends Central_Bank{
    @Override
    double interate(){
        return 10.8;

    }
}

class overiding{
    public static void main(String[] args) {
// System.out.println("Sant Rampal ji Maharaj ji blessing me ");

Central_Bank ub;

ub = new UBL();
System.out.println("UBL intrest_rate "+ ub.interate());
ub = new HBL();



System.out.println("hbl intrest_rate "+ ub.interate());


    }
}