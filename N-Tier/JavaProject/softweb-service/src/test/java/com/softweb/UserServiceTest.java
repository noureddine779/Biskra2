package com.softweb;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
/*
	@Mock – creates mocks
	@InjectMocks – creates objects and inject mocked dependencies
*/

    @InjectMocks
    private UserService userService;

    @Mock
    private IUserDao userDao;

    @Before
    public void setup() {
        userService =  new UserService();
    }

    @Test
    public void getUsersTest() {

        List<User> users =  new ArrayList<>();
        User user = new User(1,"zekiri","Abdelali");
        users.add(user);

        doReturn(users).when(userDao).findAll();

        List<UserDto> result = userService.GetUsers();

        assertThat(result).isNotEmpty();
        verify(userDao,times(1)).findAll();
    }

}
