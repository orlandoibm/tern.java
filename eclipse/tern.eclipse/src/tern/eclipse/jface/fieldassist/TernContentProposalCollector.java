/**
 *  Copyright (c) 2013-2015 Angelo ZERR.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 */
package tern.eclipse.jface.fieldassist;

import java.util.List;

import org.eclipse.jface.fieldassist.IContentProposal;

public class TernContentProposalCollector extends
		AbstractTernContentProposalCollector {

	private final List<IContentProposal> proposals;

	public TernContentProposalCollector(List<IContentProposal> proposals) {
		this.proposals = proposals;
	}

	@Override
	protected void addProposal(IContentProposal proposal) {
		proposals.add(proposal);
	}
}
