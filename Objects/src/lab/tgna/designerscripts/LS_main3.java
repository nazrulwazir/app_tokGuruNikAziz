package lab.tgna.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_main3{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
if ((anywheresoftware.b4a.keywords.LayoutBuilder.getScreenSize()>6.5d)) { 
;
views.get("actionbar").vw.setHeight((int)((64d * scale)));
;}else{ 
;
if ((String.valueOf( String.valueOf(anywheresoftware.b4a.keywords.LayoutBuilder.isPortrait())).equals(String.valueOf("true")))) { 
;
views.get("actionbar").vw.setHeight((int)((56d * scale)));
;}else{ 
;
views.get("actionbar").vw.setHeight((int)((48d * scale)));
;};
;};
//BA.debugLineNum = 14;BA.debugLine="scvTest.SetTopAndBottom(ActionBar.Bottom, 100%y)"[main3/General script]
views.get("scvtest").vw.setTop((int)((views.get("actionbar").vw.getTop() + views.get("actionbar").vw.getHeight())));
views.get("scvtest").vw.setHeight((int)((100d / 100 * height) - ((views.get("actionbar").vw.getTop() + views.get("actionbar").vw.getHeight()))));

}
}