/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia.exceptions;

public class NoPlateException extends RuntimeException {
    public NoPlateException() {
	}
	public NoPlateException(String message) {
		super(message);
	}
}
