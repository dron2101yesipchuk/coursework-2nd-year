package com.yesipchuk.demo.service.buyerHasMedicines.impls;

import com.yesipchuk.demo.DAO.buyerHasMedicines.impls.BuyerHasMedicinesDAOFakeImpl;
import com.yesipchuk.demo.model.BuyersHasMedicines;
import com.yesipchuk.demo.service.buyerHasMedicines.interfaces.IBuyerHasMedicinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerHasMedicinesService implements IBuyerHasMedicinesService{

    @Autowired
    BuyerHasMedicinesDAOFakeImpl buyerHasMedicinesDAO;

    @Override
    public List<BuyersHasMedicines> getAll() {
        return buyerHasMedicinesDAO.getAll();
    }
}
