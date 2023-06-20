package dao;

import dataBaseConnection.ConnectionClass;
import model.LoanAgreement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoanAgreementDaoImp implements LoanAgreementDao{
    @Override
    public boolean insertloan(LoanAgreement loanAgreement) {
        try {
            Connection connection = ConnectionClass.getConnection();
            String query = "insert into  loanagreement_16931(customerId,loanAmount,tenure,roi,loanagreementdate ) values(?,?,?,?,?)"  ;
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, loanAgreement.getCustomerId());
            preparedStatement.setDouble(2,loanAgreement.getLoanAmount());
            preparedStatement.setInt(3,loanAgreement.getTenure() );
            preparedStatement.setDouble(4, loanAgreement.getRoi());
            preparedStatement.setDate(5, Date.valueOf(loanAgreement.getLoanAgreementDate()));
            return 1 == preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
