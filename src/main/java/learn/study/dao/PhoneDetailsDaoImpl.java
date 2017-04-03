package learn.study.dao;

import learn.study.entity.phone;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by vinod on 4/1/2017.
 */
@Repository
@Qualifier("sqlDatabase")
public class PhoneDetailsDaoImpl implements PhoneDetailsDao {

    private  static Map<String,phone> phoneDetails;

    static {

        phoneDetails=new HashMap<String,phone>() {
            {
                put("9440341739", new phone("srinivas", "kanakala", "9440341739", "08842323776", "abc@gmail.com", "M", "AUG", "15", "1985", "rice", "Business"));
                put("9912978759", new phone("laxman", "rao", "9912978759", "08842323776", "abc@gmail.com", "M", "AUG", "15", "1985", "rice", "Business"));
            }
        };
    }

    @Override
    public Collection<phone> getAllPhoneDetails(){

        return phoneDetails.values();
    }




    @Override
    public  phone getPhoneDetailsByNumber(String phoneNumber){

        return phoneDetails.get(phoneNumber);
    }

    @Override
    public void removePhoneDetailsByPhoneNumber(String phoneNumber){

         phoneDetails.remove(phoneNumber);
    }

    @Override
    public void updatePoneDetailsByPhoneNumber(phone p){

        phoneDetails.put(p.getMobileNumber(),p);
    }

    @Override
    public void insertPhoneDetails(phone p){
        phoneDetails.put(p.getMobileNumber(),p);
    }

}
