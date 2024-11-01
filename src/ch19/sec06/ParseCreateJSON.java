package ch19.sec06;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParseCreateJSON {
  public static void main(String[] args) {
    JSONObject root = getJsonObject();

    String json = root.toString();
    System.out.println(json);

    //-------------------------

    extractedPrint(json);

  }

  private static void extractedPrint(String json) {
    JSONObject parsed = new JSONObject(json);
    System.out.println("id     : " + parsed.getString("id"));
    System.out.println("name   : " + parsed.getString("name"));
    System.out.println("age    : " + parsed.getInt("age"));
    System.out.println("student: " + parsed.getBoolean("isStudent"));

    JSONObject tel2 = parsed.getJSONObject("tel");
    System.out.println("tel");
    System.out.println("  home   : " + tel2.getString("home"));
    System.out.println("  mobile : " + tel2.getString("mobile"));

    JSONArray skill = parsed.getJSONArray("skill_stack");
    System.out.print("skill  : [ ");
    for(Object obj : skill){
      System.out.print(obj + " ");
    }
    System.out.println("]");
    System.out.println("skill  : " + parsed.getJSONArray("skill_stack"));
  }

  private static JSONObject getJsonObject() {
    JSONObject root = new JSONObject();

    root.put("id",      "winter");
    root.put("name",    "Winston Terrain");
    root.put("age",     22);
    root.put("isStudent", false);

    JSONObject tel = new JSONObject();
    tel.put("home", "032-1098-7654");
    tel.put("mobile", "019-8765-4321");
    root.put("tel",tel);

    JSONArray skillStack = new JSONArray();
    skillStack.put("JAVA");
    skillStack.put("Python");
    skillStack.put("C");
    skillStack.put("Haskell");
    root.put("skill_stack", skillStack);
    return root;
  }
}
