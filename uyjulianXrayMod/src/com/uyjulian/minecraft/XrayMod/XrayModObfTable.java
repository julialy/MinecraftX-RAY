/* Copyright (c) 2014, Julian Uy
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 * 
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * 
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */

package com.uyjulian.minecraft.XrayMod;

import com.mumfrey.liteloader.core.runtime.Obf;

public class XrayModObfTable extends Obf {
	//TODO: Minecraft 1.7.10
	public static XrayModObfTable Block = new XrayModObfTable("net.minecraft.block.Block", "aji");
	public static XrayModObfTable RenderBlocks = new XrayModObfTable("net.minecraft.client.renderer.RenderBlocks", "blm");
	public static XrayModObfTable RenderBlocks_renderBlockByRenderType = new XrayModObfTable("func_147805_b", "b", "renderBlockByRenderType");
	
	protected XrayModObfTable(String seargeName, String obfName) {
		super(seargeName, obfName);
	}
	
	protected XrayModObfTable(String seargeName, String obfName, String mcpName) {
		super(seargeName, obfName, mcpName);
	}

}