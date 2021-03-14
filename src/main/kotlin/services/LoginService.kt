package services

import interfaces.Logavel

class LoginService {
    fun fazerLogin( logavel: Logavel) = println( logavel.login() );
}