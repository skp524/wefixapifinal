package com.example.wefix.service;
import com.example.wefix.dao.OrderHSRepository;
import com.example.wefix.dao.OrderITMRepository;
import com.example.wefix.dao.UserRepository;
import com.example.wefix.model.OrderHSRequest;
import com.example.wefix.model.OrderITMRequest;
import com.example.wefix.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderHSRepository orderHSRepository;
    @Autowired
    private OrderITMRepository orderITMRepository;
    public List<User> getUsers()
    {
        return userRepository.findAll();
    }
    public List<User> getUsersById(int id)
    {
        return userRepository.findById(id);
    }

    public void addUser(User user) {
        User newuser=new User();
        newuser.setName(user.getName());
        newuser.setEmailId(user.getEmailId());
        newuser.setContactNo(user.getContactNo());
        newuser.setPassword(user.getPassword());
        userRepository.save(newuser);
    }

    public void deleteUser(int id) {
    userRepository.deleteById(id);
    }

    public String validateLogin(String userId, String password) {
        String flag="false";
       User u= userRepository.findUserByEmailId(userId);
       if (u.getEmailId().equals(userId) && u.getPassword().equals(password) ){
           flag=u.getContactNo();
       }
       return flag;
    }

    public void addHSOrder(OrderHSRequest orderHSRequest) {
        OrderHSRequest newOrderHSRequest = new OrderHSRequest();
        newOrderHSRequest.setContactNO(orderHSRequest.getContactNO());
        newOrderHSRequest.setServiceType(orderHSRequest.getServiceType());
        newOrderHSRequest.setServiceSubType(orderHSRequest.getServiceSubType());
        newOrderHSRequest.setProblems(orderHSRequest.getProblems());
        newOrderHSRequest.setWorkDescription(orderHSRequest.getWorkDescription());
        newOrderHSRequest.setStartDate(orderHSRequest.getStartDate());
        newOrderHSRequest.setEndDate(orderHSRequest.getEndDate());
        newOrderHSRequest.setCity(orderHSRequest.getCity());
        newOrderHSRequest.setAddress(orderHSRequest.getAddress());
        orderHSRepository.save(newOrderHSRequest);
    }
        public void addITMOrder(OrderITMRequest orderITMRequest) {
            OrderITMRequest newOrderITMRequest=new OrderITMRequest();
            newOrderITMRequest.setContactNo(orderITMRequest.getContactNo());
            newOrderITMRequest.setServiceType(orderITMRequest.getServiceType());
            newOrderITMRequest.setLaptop(orderITMRequest.getLaptop());
            newOrderITMRequest.setDesktop(orderITMRequest.getDesktop());
            newOrderITMRequest.setPrinter(orderITMRequest.getPrinter());
            newOrderITMRequest.setServer(orderITMRequest.getServer());
            newOrderITMRequest.setCartridge(orderITMRequest.getCartridge());
            newOrderITMRequest.setSoftware(orderITMRequest.getSoftware());
            newOrderITMRequest.setLan(orderITMRequest.getLan());
            newOrderITMRequest.setWifi(orderITMRequest.getWifi());
            newOrderITMRequest.setSecuritySystem(orderITMRequest.getSecuritySystem());
            newOrderITMRequest.setWorkDescription(orderITMRequest.getWorkDescription());
            newOrderITMRequest.setStartDate(orderITMRequest.getStartDate());
            newOrderITMRequest.setEndDate(orderITMRequest.getEndDate());
            newOrderITMRequest.setCity(orderITMRequest.getCity());
            newOrderITMRequest.setAddress(orderITMRequest.getAddress());
            orderITMRepository.save(newOrderITMRequest);

    }

    public String forgotPassword(String name, String emailId, String contactNo) {
        String flag="false";
        User u= userRepository.findUserByEmailId(emailId);
        if (u.getName().equals(name) && u.getEmailId().equals(emailId) && u.getContactNo().equals(contactNo) ){
            flag=u.getPassword();
        }
        return flag;
    }
}
