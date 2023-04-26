/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia.exceptions;

public class PlateDuplicateException extends RuntimeException {
    public PlateDuplicateException() {
	}
	public PlateDuplicateException(String message) {
		super(message);
	}
    
}
