/** if no modifier is used,it is treated as 'default' by default
 *  Default modifier is only accessible within package
*/

package pack;

class A { // No access modifier to the class hence treated as default
    void msg() {System.out.println("Hello!");}
}
