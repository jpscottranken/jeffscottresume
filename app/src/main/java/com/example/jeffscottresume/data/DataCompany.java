package com.example.jeffscottresume.data;

import com.example.jeffscottresume.model.ModelCompany;

import java.util.ArrayList;
import java.util.List;

public class DataCompany {
    public static List<ModelCompany> getDataCompanies() {
        List<ModelCompany> companies = new ArrayList<>();

        ModelCompany company1 		= new ModelCompany();
        company1.companyName 		= ("Ranken Technical College");
        company1.companyCity 		= ("Wentzville");
        company1.companyState 		= ("MO");
        company1.companyPeriod 		= ("2016 - Present");
        company1.companyJobDesc 	= ("Information Technology Instructor");
        company1.companyLogo 		= ("logo01-ranken");
        companies.add(company1);

        ModelCompany company2 		= new ModelCompany();
        company2.companyName		= ("Blackhawk Technical College");
        company2.companyCity 		= ("Janesville");
        company2.companyState 		= ("WI");
        company2.companyPeriod 		= ("1993 - 2016");
        company2.companyJobDesc		= ("Information Technology Instructor");
        company2.companyLogo		= ("logo02-btc");
        companies.add(company2);

        ModelCompany company3 		= new ModelCompany();
        company3.companyName		= ("Woodward Governor Company");
        company3.companyCity		= ("Rockford");
        company3.companyState		= ("IL");
        company3.companyPeriod 		= ("1992");
        company3.companyJobDesc 	= ("Electronic Data Interchange Programmer/Analyst");
        company3.companyLogo 		= ("logo03-wgc");
        companies.add(company3);

        ModelCompany company4 		= new ModelCompany();
        company4.companyName		= ("Mid-State Technical College");
        company4.companyCity		= ("Stevens Point");
        company4.companyState 		= ("WI");
        company4.companyPeriod 		= ("1988 – 1991");
        company4.companyJobDesc 	= ("Computer Information Systems Instructor");
        company4.companyLogo 		= ("logo04-mstc");
        companies.add(company4);

        ModelCompany company5 		= new ModelCompany();
        company5.companyName		= ("AT & T - Bell Laboratories");
        company5.companyCity		= ("Naperville");
        company5.companyState		= ("IL");
        company5.companyPeriod 		= ("1984 – 1988");
        company5.companyJobDesc 	= ("C Language Programmer");
        company5.companyLogo 		= ("logo05-att");
        companies.add(company5);

        ModelCompany company6 		= new ModelCompany();
        company6.companyName		= ("Kohl's Food Stores");
        company6.companyCity		= ("Milwaukee");
        company6.companyState 		= ("WI");
        company6.companyPeriod 		= ("1973 - 1982");
        company6.companyJobDesc 	= ("Produce Department Worker");
        company6.companyLogo		= ("logo06-kohls");
        companies.add(company6);

        ModelCompany company7 		= new ModelCompany();
        company7.companyName		= ("Milwaukee Sentinel Newspaper");
        company7.companyCity		= ("Milwaukee");
        company7.companyState 		= ("WI");
        company7.companyPeriod		= ("1978 - 1980");
        company7.companyJobDesc 	= ("Reporter");
        company7.companyLogo		= ("logo07-mjs");
        companies.add(company7);

        ModelCompany company8 		= new ModelCompany();
        company8.companyName 		= ("Northeast Post Newspaper");
        company8.companyCity		= ("Milwaukee");
        company8.companyState		= ("WI");
        company8.companyPeriod		= ("1976 - 1978");
        company8.companyJobDesc 	= ("Reporter");
        company8.companyLogo 		= ("logo08-nep");
        companies.add(company8);

        return companies;
    }
}
