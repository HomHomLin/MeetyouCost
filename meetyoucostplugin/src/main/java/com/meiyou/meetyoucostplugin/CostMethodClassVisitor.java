package com.meiyou.meetyoucostplugin;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.AdviceAdapter;

/**
 * 方法耗时 visitor
 * Author: lwh
 * Date: 4/28/17 15:37.
 */

public class CostMethodClassVisitor extends ClassVisitor {

    public CostMethodClassVisitor(ClassVisitor classVisitor) {
        super(Opcodes.ASM5,classVisitor);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature,
                                     String[] exceptions) {
        MethodVisitor methodVisitor = cv.visitMethod(access, name, desc, signature, exceptions);
        methodVisitor = new AdviceAdapter(Opcodes.ASM5, methodVisitor, access, name, desc) {
//
//            boolean inject = true;
//            private boolean isInject(){
//               /* if(name.equals("setStartTime") || name.equals("setEndTime") || name.equals("getCostTime")){
//                   return false;
//                }
//                return true;*/
//               return inject;
//            }

            public void print(String e){
                                    mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
                    mv.visitLdcInsn(e);
                    mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println",
                            "(Ljava/lang/String;)V", false);
            }
//            @Override
//            public void visitCode() {
//                super.visitCode();
//
//            }
//
//            @Override
//            public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
//                super.visitMethodInsn(opcode, owner, name, desc, itf);
//            }

//            @Override
//            public org.objectweb.asm.AnnotationVisitor visitAnnotation(String desc, boolean visible) {
//                if (Type.getDescriptor(Cost.class).equals(desc)) {
//                    inject = true;
//                }
//
//                return super.visitAnnotation(desc, visible);
//            }

            @Override
            protected void onMethodEnter() {
                //super.onMethodEnter();
//                if(isInject()){
                print("format:"+name + ",desc=" + methodDesc);

//                for(Type type : types){
                    /**
                     * 05-22 17:13:42.674 21722-21722/com.meiyou.meetyoucostdemo I/System.out: ========startttt=========onClick,desc=(Landroid/view/View;)V,signature= null
                     05-22 17:13:42.694 21722-21722/com.meiyou.meetyoucostdemo I/System.out: ========type=========Landroid/view/View;
                     05-22 17:13:42.694 21722-21722/com.meiyou.meetyoucostdemo I/System.out: yes3:android.widget.Button{3a3fd7af VFED..C. ...P.... 0,0-720,96 #7f0b0056 app:id/maidian}
                     05-22 17:13:42.694 21722-21722/com.meiyou.meetyoucostdemo I/System.out: ========startttt=========show2,desc=(Landroid/view/View;ILjava/lang/String;)V,signature= null
                     05-22 17:13:42.694 21722-21722/com.meiyou.meetyoucostdemo I/System.out: ========type=========Landroid/view/View;
                     05-22 17:13:42.694 21722-21722/com.meiyou.meetyoucostdemo I/System.out: ========type=========I
                     05-22 17:13:42.694 21722-21722/com.meiyou.meetyoucostdemo I/System.out: ========type=========Ljava/lang/String;
                     */
//                    mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
//                    mv.visitLdcInsn("========type=========" + type.toString());
//                    mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println",
//                            "(Ljava/lang/String;)V", false);
//                }
//
//                    mv.visitLdcInsn(name);
////                    Type.getMethodDescriptor(m)
//                    mv.visitMethodInsn(INVOKESTATIC, "java/lang/System", "nanoTime", "()J", false);
//                    mv.visitMethodInsn(INVOKESTATIC, "com/meiyou/meetyoucost/TimeCache", "setStartTime",
//                            "(Ljava/lang/String;J)V", false);
//                }
                if(name.equals("onClick")){
                    //onclick
                    Type[] types = Type.getArgumentTypes(methodDesc);
                    for(int i = 0; i < types.length ; i++){
                        print(types[i].toString());
                        if(types[i].toString().equals("Landroid/view/View;")){
                            //view
//                    mv.visitLdcInsn();
                            mv.visitVarInsn(ILOAD, i + 1);
                            mv.visitMethodInsn(INVOKESTATIC, "com/meiyou/meetyoucost/TimeCache", "setView",
                                    "(Landroid/view/View;)V", false);
                            break;
                        }
                    }

                }
            }

//            @Override
//            protected void onMethodExit(int i) {
                //super.onMethodExit(i);
//                if(isInject()){
//                    mv.visitLdcInsn(name);
//                    mv.visitMethodInsn(INVOKESTATIC, "java/lang/System", "nanoTime", "()J", false);
//                    mv.visitMethodInsn(INVOKESTATIC, "com/meiyou/meetyoucost/TimeCache", "setEndTime",
//                            "(Ljava/lang/String;J)V", false);
//
//                    mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
//                    mv.visitLdcInsn(name);
//                    mv.visitMethodInsn(INVOKESTATIC, "com/meiyou/meetyoucost/TimeCache", "getCostTime",
//                            "(Ljava/lang/String;)Ljava/lang/String;", false);
//                    mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println",
//                            "(Ljava/lang/String;)V", false);
//
//                    mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
//                    mv.visitLdcInsn("========end=========");
//                    mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println",
//                            "(Ljava/lang/String;)V", false);
//                }
//            }
        };
        return methodVisitor;

    }
}
