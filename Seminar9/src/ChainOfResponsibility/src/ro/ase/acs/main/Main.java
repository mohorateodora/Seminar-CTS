package ChainOfResponsibility.src.ro.ase.acs.main;

import ChainOfResponsibility.src.ro.ase.acs.chain.CallCenterHandler;
import ChainOfResponsibility.src.ro.ase.acs.chain.CallCenterOperator;
import ChainOfResponsibility.src.ro.ase.acs.chain.SalesManager;

public class Main {

	public static void main(String[] args) {
        CallCenterHandler operator = new CallCenterOperator();
        CallCenterHandler callCenterManager = new CallCenterOperator();
        CallCenterHandler salesManager = new SalesManager();

        operator.setNextHandler(callCenterManager);
        callCenterManager.setNextHandler(salesManager);

        operator.refund(60);
        operator.refund(160);
        operator.refund(1200);
        operator.refund(7000);
	}

}
