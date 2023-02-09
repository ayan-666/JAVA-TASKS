//Create a program which will take input from users for registration and save the info to a json file.
// The system will require following user info:
//Full Name, email, password, address, mobile no.

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class RegistrationInfoSaveInJSON {
    public static void main(String[] args) throws IOException, ParseException {
        char ch = 'y';
        String fileName = "./src/main/resources/Student.json";
        do {
            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(new FileReader(fileName));
            JSONObject studentObj = new JSONObject();
            Scanner input = new Scanner(System.in);
            System.out.println("Enter full name: ");
            studentObj.put("Full Name", input.nextLine());
            System.out.println("Enter address: ");
            studentObj.put("Address", input.nextLine());
            System.out.println("Enter email: ");
            studentObj.put("Email", input.next());
            System.out.println("Enter a valid password: ");
            studentObj.put("Password", input.next());
            System.out.println("Enter mobile number: ");
            studentObj.put("Mobile Number", input.next());
            JSONArray jsonArray = (JSONArray) obj;
            jsonArray.add(studentObj);
            System.out.print(jsonArray);
            FileWriter file = new FileWriter(fileName);
            file.write(jsonArray.toJSONString());
            file.flush();
            file.close();
            System.out.println();
            System.out.println("ALL INFO SAVED IN JSONFILE!!!");
            System.out.println("\nDo you want to add more?[y/n]");
            ch = input.next().charAt(0);
        }
        while (ch != 'n') ;
    }
}
