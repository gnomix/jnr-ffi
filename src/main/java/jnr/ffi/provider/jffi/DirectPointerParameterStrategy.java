package jnr.ffi.provider.jffi;

import jnr.ffi.Pointer;

/**
 *
 */
final class DirectPointerParameterStrategy extends AbstractDirectPointerParameterStrategy {
    static final PointerParameterStrategy INSTANCE = new DirectPointerParameterStrategy();

    @Override
    public long address(Object o) {
        return ((Pointer) o).address();
    }
}
