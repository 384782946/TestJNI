#include "TestNative.h"
#include <iostream>

using namespace std;

JNIEXPORT void JNICALL Java_TestNative_SayHello(JNIEnv *, jobject)
{
	cout << "Hello world,i'm c++." << endl;
}
