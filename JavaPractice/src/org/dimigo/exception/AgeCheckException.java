/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 * 	|_ AgeCheckException
 *
 *	1. 개요 :
 *	2. 작성일 : 2015. 9. 23.
 *  </pre>
 *
 * @author		: 이승준
 * @version		: 1.0
 */
public class AgeCheckException extends Exception{ 
	
	public AgeCheckException() {
		
	}
	
	public AgeCheckException(Movie movie) throws Exception {
		throw new Exception(movie.getTitle() + "은/는 " + movie.getlimitAge() + "세 이상 관람가입니다.");
	}
}
  
