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
                print("onMethodEnter:"+name + ",desc=" + methodDesc + ",return="+Type.getReturnType(desc).toString());
//                returnValue();

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
//                if(name.equals("onClick")){
                    //onclick
//                    mv.visitFieldInsn(GETSTATIC,"java/lang/System", "out", "Ljava/io/PrintStream;");
                    //stack: PrintStream

//                    mv.visitMaxs(1, 3);

                    ///Date date=new Date();
                    ////local[1]=new Object[10]
//                    mv.visitIntInsn(BIPUSH, 10);
//                    //stack: 10
//                    mv.visitTypeInsn(ANEWARRAY, "java/lang/Object");
//                    mv.visitVarInsn(ASTORE, 19);


//                    mv.visitIntInsn(BIPUSH, 10);
//                    //stack: 10
//                    mv.visitTypeInsn(ANEWARRAY, "java/lang/String");
//                    mv.visitVarInsn(ASTORE, 3);
                    //保存数据
//                    mv.visitVarInsn(ALOAD, 19);
//                    mv.visitInsn(ICONST_0);
//                    mv.visitTypeInsn(NEW, "java/lang/Object");
//                    mv.visitInsn(DUP);
//                    mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
//                    mv.visitInsn(AASTORE);
//                    //拿出第二个数组
////                    mv.visitVarInsn(ALOAD, 3);
//                    mv.visitMethodInsn(INVOKESTATIC, "com/meiyou/meetyoucost/TimeCache", "handleList",
//                            "([Ljava/lang/Object;)V", false);

//                    mv.visitTypeInsn(NEW, "com/meiyou/meetyoucost/Method");
//
//                    mv.visitInsn(DUP);
//                    mv.visitVarInsn(ASTORE, 3);
//                    	//mv.visitVarInsn(ASTORE,2); //store the reference to be used later
//
//                    mv.visitMethodInsn(INVOKESPECIAL, "com/meiyou/meetyoucost/Method", "<init>", "()V");
//
//                    //stack: use one copy. another copy is in stack
//                    //mv.visitVarInsn(ALOAD, 2); //load object from stack
//                    mv.visitLdcInsn(10);
//                    //	mv.visitVarInsn(ALOAD, 1);
//                    mv.visitMethodInsn(INVOKEVIRTUAL, "com/meiyou/meetyoucost/Method", "setParamsSize",
//                            "(I)V", false);
//                    mv.visitInsn(POP);
//                    mv.visitInsn(DUP);
//                    mv.visitVarInsn(ALOAD, 2);
//                    mv.visitMethodInsn(INVOKEVIRTUAL, "com/meiyou/meetyoucost/Method", "doLog",
//                            "()V", false);
//                    mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/Object;)V");
//                    Type[] types = Type.getArgumentTypes(methodDesc);
//                    int start_index = types.length + 1;
//
//                //包括this=0
//                    mv.visitIntInsn(BIPUSH, types.length + 1);
//                    mv.visitTypeInsn(ANEWARRAY, "java/lang/Object");
//                    mv.visitVarInsn(ASTORE, start_index);
//                //存储this
//                    mv.visitVarInsn(ALOAD, start_index);
//                mv.visitIntInsn(BIPUSH, 0);
//                mv.visitVarInsn(ALOAD, 0);
//                mv.visitInsn(AASTORE);
//                //遍历方法变量
//                    for(int i = 0; i < types.length ; i++){
//                        print(types[i].toString());
//
//
//                        mv.visitVarInsn(ALOAD, start_index);
//                        mv.visitIntInsn(BIPUSH, i + 1);
//                        mv.visitVarInsn(ALOAD, i + 1);
//                        //判断基础类型
//                        if(types[i].toString().equals("I")){
//                            mv.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
//                        }
//                        mv.visitInsn(AASTORE);

//                        if(types[i].toString().equals("Landroid/view/View;")){
//                            //view
////                    mv.visitLdcInsn();
//                            mv.visitVarInsn(ILOAD, i + 1);
//                            mv.visitMethodInsn(INVOKESTATIC, "com/meiyou/meetyoucost/TimeCache", "setView",
//                                    "(Landroid/view/View;)V", false);
//                            break;
//                        }
//                    }

                loadThis();
                mv.visitLdcInsn(name);
                loadArgArray();
//                mv.visitVarInsn(ALOAD, start_index);
                    mv.visitMethodInsn(INVOKESTATIC, "com/meiyou/meetyoucost/TimeCache", "onMethodEnter",
                            "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V", false);

//                }
            }

            @Override
            protected void onMethodExit(int i) {
                print("onMethodExit:"+name + ",desc=" + methodDesc + ",return="+Type.getReturnType(desc).toString());
//                Type[] types = Type.getArgumentTypes(methodDesc);
//                returnValue();
//                returnValue();
//                int start_index = types.length + 1;
                loadThis();
                mv.visitLdcInsn(name);
                loadArgArray();
//                returnValue();
                mv.visitMethodInsn(INVOKESTATIC, "com/meiyou/meetyoucost/TimeCache", "onMethodEnd",
                        "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V", false);
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
            }
        };
        return methodVisitor;

    }
}
