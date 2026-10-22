public interface Descargable{
    double calculartamanoMB();

    default boolean cabeen(double espacioTotalMB){
        if(calculartamanoMB() <= espacioTotalMB){
            return true;
        }
        else{
            return false;
        }
    }
}