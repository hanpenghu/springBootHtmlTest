package com.hanhan.springboothtmltest.BController;


import com.hanhan.springboothtmltest.DDao.MfTyMapper;
import com.hanhan.springboothtmltest.EDto.MfTy;
import com.hanhan.springboothtmltest.EDto.MfTyExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class RestTest1Controller {
    @Autowired
    MfTyMapper mfTyMapper;
///////////////////////////////////////////////////////////////////////////
    @RequestMapping(value = "test",method= RequestMethod.GET)
    public List<MfTy> test(){
        MfTyExample MfTyExample=new MfTyExample();
        MfTyExample.createCriteria().andMobIdIsNotNull();
        List<MfTy> mfTIES = mfTyMapper.selectByExample(MfTyExample);
        return mfTIES;
    }

////////////////////////////////////////////////////////////////////////////
}
///////////////////////////////////////////////////////////////////////////