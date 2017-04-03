package learn.study.service;

import learn.study.dao.PhoneDetailsDao;
import learn.study.entity.phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by vinod on 4/1/2017.
 */
@Service
public class PhoneDetailsService {

    @Autowired
    @Qualifier("sqlDatabase")
    private PhoneDetailsDao phoneDetailsDao;


    public Collection<phone> getAllPhoneDetails(){

        return phoneDetailsDao.getAllPhoneDetails();
    }

    public  phone getPhoneDetailsByNumber(String phoneNumber){

        return phoneDetailsDao.getPhoneDetailsByNumber(phoneNumber);
    }


    public void removePhoneDetailsByNumber(String phoneNumber){

        phoneDetailsDao.removePhoneDetailsByPhoneNumber(phoneNumber);
    }

    public void updatePoneDetailsByPhoneNumber(phone p){

        phoneDetailsDao.updatePoneDetailsByPhoneNumber(p);
    }


    public void insertPhoneDetails(phone p){
        phoneDetailsDao.insertPhoneDetails(p);
    }

}
