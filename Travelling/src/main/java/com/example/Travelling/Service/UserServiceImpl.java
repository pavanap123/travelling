package com.example.Travelling.Service;

import com.example.Travelling.Model.User;
import com.example.Travelling.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService{
@Autowired
    UserRepo userRepo;
    @Override
    public User adduser(User user) throws Exception {

           if(Objects.isNull(user.getEmail()) || Objects.isNull(user.getName())){

               throw new Exception("enter all the fields");

           }else

               return userRepo.save(user);
    }

    @Override
    public User getUserById(Integer id) throws UserNotFoundException {

        return userRepo.findById(id).orElseThrow(()->new  UserNotFoundException("No Such User("+id+")found"));

    }

    @Override
    public List<User> getUser() {
        return null;
    }

    @Override
    public User updateUser(Integer userId, User user) throws UserNotFoundException {
        return null;
    }

    @Override
    public void deleteUser(Integer userId) throws UserNotFoundException {

    }

}
