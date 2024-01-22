package com.devamatre.appsuite.jdk;

import com.devamatre.appsuite.core.BeanUtils;
import com.devamatre.appsuite.domain.User;
import com.devamatre.appsuite.jdk.dto.AddressDTO;
import com.devamatre.appsuite.jdk.dto.StateDTO;
import com.devamatre.appsuite.jdk.dto.UserDTO;

/**
 * Author: Rohtash Singh Lakra
 * Created: 5/26/20 10:02 PM
 * Version: 1.0.0
 */
public class DeepCopyTest {
    public static void main(String[] args) {
        StateDTO stateDTO = new StateDTO();
        stateDTO.setCode("CA");
        stateDTO.setName("California");

        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setId(100L);
        addressDTO.setLine1("34593 Pueblo Ter");
        addressDTO.setCity("Fremont");
        addressDTO.setZip("94555");
        addressDTO.setState(stateDTO);

        UserDTO userDTO = new UserDTO();
        userDTO.setId(111l);
        userDTO.setUserName("rslakra");
        userDTO.setAddress(addressDTO);

        try {
            User user = new User();
            System.out.println(userDTO);
            BeanUtils.deepCopyProperties(userDTO, user);
            System.out.println(user);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
