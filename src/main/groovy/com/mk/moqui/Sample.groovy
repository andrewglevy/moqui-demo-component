package com.mk.moqui.sample

import groovy.transform.CompileStatic
import org.moqui.context.ExecutionContext

@CompileStatic
class Sample {
	static Map<String, Object> logger(ExecutionContext ec) {
		println('Custom Java class')
		println(ec.context)
		println(ec.getContext())
		println(ec.getClass().getMethods())
	}
}
