package com.example.jeffscottresume.data;

import com.example.jeffscottresume.model.ModelSchool;

import java.util.ArrayList;
import java.util.List;

public class DataSchool {
    public static List<ModelSchool> getDataSchools() {
        List<ModelSchool> schools = new ArrayList<>();

        ModelSchool school1 = new ModelSchool();
        school1.schoolName = ("University of WI - Stout");
        school1.schoolDegreeName = ("Educational Specialist Program (24/32 credits completed)");
        school1.schoolGraduationDate = ("1988");
        school1.schoolImageLink = ("@drawable/school01-uwstout");
        schools.add(school1);

        ModelSchool school2 = new ModelSchool();
        school2.schoolName = ("Illinois Institute of Technology");
        school2.schoolDegreeName = ("M.S. Computer Science");
        school2.schoolGraduationDate = ("1985");
        school2.schoolImageLink = ("@drawable/school02-iit");
        schools.add(school2);

        ModelSchool school3 = new ModelSchool();
        school3.schoolName = ("NorthCentral Technical College");
        school3.schoolDegreeName = ("A.A.S. Data Processing");
        school3.schoolGraduationDate = ("1985");
        school3.schoolImageLink = ("@drawable/school03-ntc");
        schools.add(school3);

        ModelSchool school4 = new ModelSchool();
        school4.schoolName = ("University of WI - Milwaukee");
        school4.schoolDegreeName = ("B.A. Mass Communications (Journalism)");
        school4.schoolGraduationDate = ("1978");
        school4.schoolImageLink = ("@drawable/school04-uwm");
        schools.add(school4);

        return schools;
    }
}
