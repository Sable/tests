import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Ann {}

public class test073 {
	@Ann
	void foo() {}
}
