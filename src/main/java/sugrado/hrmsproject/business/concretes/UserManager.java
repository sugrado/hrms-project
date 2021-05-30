package sugrado.hrmsproject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sugrado.hrmsproject.business.abstracts.UserService;
import sugrado.hrmsproject.business.constants.Messages;
import sugrado.hrmsproject.core.utilities.results.DataResult;
import sugrado.hrmsproject.core.utilities.results.Result;
import sugrado.hrmsproject.core.utilities.results.SuccessDataResult;
import sugrado.hrmsproject.core.utilities.results.SuccessResult;
import sugrado.hrmsproject.dataAccess.abstracts.UserDao;
import sugrado.hrmsproject.entities.concretes.User;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    @Override
    public SuccessDataResult<List<User>> getAll() {
        return new SuccessDataResult<List<User>>(this.userDao.findAll(), Messages.listed);
    }

    @Override
    public SuccessDataResult<User> getById(int userId) {
        return new SuccessDataResult<User>(this.userDao.findById(userId).get(), Messages.listed);
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult(Messages.added);
    }

    @Override
    public Result update(User user) {
        this.userDao.save(user);
        return new SuccessResult(Messages.updated);
    }

    @Override
    public Result delete(User user) {
        this.userDao.delete(user);
        return new SuccessResult(Messages.deleted);
    }

    @Override
    public DataResult<User> getByMail(String email)
    {
        return new SuccessDataResult<User>(this.userDao.findByEmailAddress(email));
    }
}
