package learn.study.dao;

import learn.study.entity.phone;

import java.util.Collection;

/**
 * Created by vinod on 4/1/2017.
 */
public interface PhoneDetailsDao {
    Collection<phone> getAllPhoneDetails();

    phone getPhoneDetailsByNumber(String phoneNumber);

    void removePhoneDetailsByPhoneNumber(String phoneNumber);

    void updatePoneDetailsByPhoneNumber(phone p);

    void insertPhoneDetails(phone p);
}
