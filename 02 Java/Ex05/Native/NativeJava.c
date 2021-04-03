#include <jni.h>
#include "NativeJava.h"

JNIEXPORT jint JNICALL Java_Main_square(
    JNIEnv *env, jobject obj, jint i) {
  return i * i;
}