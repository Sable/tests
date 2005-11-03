import java.lang.annotation.Annotation;
import java.util.Map;

import sun.reflect.annotation.AnnotationParser;

public class test189 {
	{
		Map<Class, Annotation> map = AnnotationParser.parseAnnotations(null, null, null);
	}
}
