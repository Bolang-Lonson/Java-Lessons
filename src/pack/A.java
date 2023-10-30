/** if no modifier is used,it is treated as 'default' by default
 *  Default modifier is only accessible within package
*/

package pack;

class C { // No access modifier to the class hence treated as default
    void msg() {System.out.println("Hello!");}
}

/** 
 * Protected access modifier is accessible within package and outside the package through inheritance only
 * Protected access modifier can be applied on the data member, method and constructor but not on a class
 */

public class A {
    protected void msg() {System.out.println("Hello!");}
}